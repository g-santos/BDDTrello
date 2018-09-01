package util;

public enum PAGES {
    FLUXO_1,
    FLUXO_2;

    @Override
    public String toString(){
        switch (this) {
            case FLUXO_1: return "https://docs.google.com/forms/d/e/1FAIpQLSf2xlmDNx7SNEkI4LZWbUi-kPNw9VgknNK9LKrYMb9vzyKPpg/viewform";
            case FLUXO_2: return "https://docs.google.com/forms/d/e/1FAIpQLScZOhHChWZoNoajGmE-Kqhvu7YpndNlgmF1ebBpsxsUdO1N2w/viewform";
            default: return "unknown";
        }
    }
}
