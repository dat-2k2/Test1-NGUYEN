package edu.hsai.hw3;

import java.util.List;

interface Expected {
    String SITE_NAME = "Home Page";
    String LOGGED_USER_NAME = "ROMAN IOVLEV";
    int HEADER_SECTION_ITEMS_SIZE = 4;
    List<String> HEADER_SECTION_ITEMS_NAMES =
            List.of("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS");
    int BENEFIT_ICONS_SIZE = 4;
    int BENEFIT_ICONS_TEXTS_SIZE = 4;
    List<String> BENEFIT_ICONS_TEXTS_STRINGS =
            List.of("To include good practices\nand ideas from successful\nEPAM project",
                    "To be flexible and\ncustomizable", "To be multiplatform",
                    "Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…");
    int LEFT_SECTION_ITEMS_SIZE = 5;
    List<String> LEFT_SECTION_ITEMS_NAMES =
            List.of("Home", "Contact form", "Service", "Metals & Colors", "Elements packs");

    List<String> DIFFERENT_ELEMENTS_LOGS =
            List.of("Colors: value changed to Yellow", "metal: value changed to Selen",
                    "Wind: condition changed to true", "Water: condition changed to true");
}
