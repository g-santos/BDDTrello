package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import java.util.Map;
import org.junit.Assert;

public class TrelloStep {

	final String BASE_URL = "https://api.trello.com/1/";
	final String AUTH = "key=f3e32fd3321c7908977e692561f1d931&token=916d0a5f9e102af827c04667d1a254caf3f6f608040dca4a38ef8604f63f9bb2";
	private Response response;
	private String cardId;

	@Dado("^que acesse a API com sucesso$")
	public void que_acesse_a_API_com_sucesso() throws Throwable {
		response = given().get(BASE_URL + "boards/qVfoHpqi?" + AUTH);
		response.prettyPrint();
	}

	@Entao("^eu tenho o resultado com status (\\d+)$")
	public void eu_tenho_o_resultado_com_status(int status) throws Throwable {
		Assert.assertEquals(status, response.statusCode());
	}

	@Quando("^crio um card com o nome \"([^\"]*)\"$")
	public void crio_um_card_com_o_nome(String nome) throws Throwable {
		response = given().contentType("application/jason")
				.post(BASE_URL + "cards?name=" + nome + "&idList=5b89d812a5df1e3e188dab0c&keepFromSource=all&" + AUTH);
		response.prettyPrint();
		Map<String, String> card = response.jsonPath().getMap("$");

		cardId = card.get("id");

	}

	@Quando("^comento \"([^\"]*)\"$")
	public void comento(String comment) throws Throwable {
		response = given().contentType("aplication/jason")
				.post(BASE_URL + "cards/" + cardId + "/actions/comments?text=" + comment + "&" + AUTH);
		response.prettyPrint();
	}

	@Quando("^excluo com sucesso$")
	public void excluo_com_sucesso() throws Throwable {
		response = given().contentType("application/json").delete(BASE_URL + "cards/" + cardId + "?" + AUTH);
	}

	@Entao("^eu tenho o resultado com o status (\\d+)$")
	public void eu_tenho_o_resultado_com_o_status(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
