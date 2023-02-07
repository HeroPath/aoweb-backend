package com.gianca1994.aowebbackend.config;


public class ExpPerLvlConfig {
    public static final long[] LEVELS = new long[]{
            5L, 13L, 23L, 35L, 51L, 71L, 96L, 128L, 168L, 220L, 284L, 363L, 462L, 584L, 732L, 911L,
            1128L, 1387L, 1696L, 2061L, 2491L, 2995L, 3584L, 4267L, 5057L, 5967L, 7011L, 8205L,
            9565L, 11109L, 12858L, 14832L, 17053L, 19547L, 22339L, 25457L, 28930L, 32792L, 37075L, 41816L,
            47054L, 52828L, 59182L, 66162L, 73816L, 82195L, 91354L, 101348L, 112239L, 124089L,
            136966L, 150937L, 166078L, 182465L, 200178L, 219302L, 239927L, 262143L, 286049L, 311746L,
            339338L, 368938L, 400658L, 434620L, 470949L, 509774L, 551230L, 595460L, 642608L, 692827L,
            746276L, 803117L, 863521L, 927665L, 995731L, 1067909L, 1144395L, 1225393L, 1311113L, 1401772L,
            1497595L, 1598816L, 1705674L, 1818418L, 1937304L, 2062598L, 2194571L, 2333508L, 2479697L,
            2633438L, 2795041L, 2964824L, 3143114L, 3330249L, 3526577L, 3732455L, 3948252L, 4174345L,
            4411123L, 4658988L, 4918350L, 5189632L, 5473267L, 5769703L, 6079396L, 6402817L, 6740448L,
            7092784L, 7460333L, 7843615L, 8243165L, 8659530L, 9093271L, 9544964L, 10015198L, 10504577L,
            11013718L, 11543256L, 12093837L, 12666127L, 13260803L, 13878561L, 14520113L, 15186184L,
            15877519L, 16594879L, 17339040L, 18110799L, 18910967L, 19740375L, 20599871L, 21490321L,
            22412612L, 23367646L, 24356346L, 25379657L, 26438539L, 27533974L, 28666965L,
            29838535L, 31049727L, 32301605L, 33595255L, 34931785L, 36312323L, 37738021L, 39210052L,
            40729614L, 42297925L, 43916228L, 45585789L, 47307900L, 49083874L, 50915050L, 52802791L,
            54748488L, 56753553L, 58819428L, 60947577L, 63139493L, 65396695L, 67720729L, 70113168L,
            72575613L, 75109692L, 77717063L, 80399410L, 83158449L, 85995922L, 88913603L, 91913295L,
            94996831L, 98166075L, 101422921L, 104769295L, 108207155L, 111738490L, 115365322L, 119089704L,
            122913724L, 126839501L, 130869191L, 135004982L, 139249094L, 143603787L, 148071351L,
            152654114L, 157354440L, 162174728L, 167117415L, 172184973L, 177379912L, 182704781L,
            188162164L, 193754687L, 199485013L, 205355843L, 211369919L, 217530023L, 223838977L,
            230299643L, 236914924L, 243687767L, 250621156L, 257718123L, 264981739L, 272415118L,
            280021418L, 287803842L, 295765637L, 303910092L, 312240545L, 320760376L, 329473013L,
            338381930L, 347490646L, 356802730L, 366321796L, 376051507L, 385995575L, 396157760L,
            406541871L, 417151767L, 427991356L, 439064600L, 450375507L, 461928141L, 473726614L,
            485775093L, 498077796L, 510638995L, 523463016L, 536554237L, 549917094L, 563556073L,
            577475720L, 591680635L, 606175474L, 620964949L, 636053831L, 651446948L, 667149186L,
            683165488L, 699500860L, 716160363L, 733149121L, 750472318L, 768135198L, 786143066L,
            804501290L, 823215302L, 842290592L, 861732718L, 881547300L, 901740022L, 922316633L,
            943282948L, 964644846L, 986408274L, 1008579246L, 1031163841L, 1054168208L, 1077598562L,
            1101461191L, 1125762446L, 1150508754L, 1175706607L, 1201362572L, 1227483285L, 1254075454L,
            1281145859L, 1308701355L, 1336748867L, 1365295397L, 1394348019L, 1423913884L, 1454000216L,
            1484614318L, 1515763567L, 1547455418L, 1579697404L, 1612497135L, 1645862301L, 1679800669L,
            1714320089L, 1749428488L, 1785133875L, 1821444343L, 1858368062L, 1895913288L, 1934088359L,
            1972901696L, 2012361805L, 2052477277L, 2093256787L, 2134709096L, 2176843052L, 2219667591L,
            2263191733L, 2307424589L
    };

    public static long getExpInitial() {
        return LEVELS[ModifConfig.START_LVL - 1];
    }

    public static long getExpNextLevel(int currentLevel) {
        return LEVELS[currentLevel];
    }
}





