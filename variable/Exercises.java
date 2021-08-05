package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoonsPlaying =3;
		int numberOfRaccoonsGone = 2;
		int numberOfRaccoonsLeft = numberOfRaccoonsPlaying - numberOfRaccoonsGone;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOgFlowers = 5;
		int numberOfBees = 3;
		int differenceBetweenFlowersAndBees = numberOgFlowers - numberOfBees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int numberOfPigeonEatingFirst = 1;
		int numberOfPigeonComingAfter =1;
		int totalPigeonEating = numberOfPigeonEatingFirst + numberOfPigeonComingAfter;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfOwlsBeginning = 3;
		int numberOfOwlsJoined = 2;
		int totalOwlsOnTheFence = numberOfOwlsBeginning + numberOfOwlsJoined;



        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeavers = 2;
		int numberOfBeaversGone = 1;
		int numberOfBeaversStillWorking = numberOfBeavers - numberOfBeaversGone;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numberOfToucansOnTree = 2;
		int numberOfToucansJoins = 1;
		int totalToucansInAll = numberOfToucansOnTree + numberOfToucansJoins;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int differenceBetweenSquirrelsAndNuts = numberOfSquirrels - numberOfNuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int numberOfQuarter =1;
		int numberOfDime = 1;
		int numberOfNickels = 2;
		double amountFound = numberOfQuarter/4 + numberOfNickels/20 + numberOfDime/10;


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfMuffinsForMacAdams = 20;
		int numberOfMuffinsForBriers = 18;
		int numberOfMuffinsForFlannery = 17;
		int numberOfMuffinsForFirstGrade = numberOfMuffinsForBriers + numberOfMuffinsForFlannery + numberOfMuffinsForMacAdams;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int priceOfFirstToys =24;
		int priceOfWhistle = 14;
		int amountSpend = priceOfWhistle + priceOfFirstToys;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int numberOfLargeMarshmallows = 8;
		int numberOfMiniMarshmallows =10;
		int numberOfMarshmallowsUse = numberOfLargeMarshmallows + numberOfMiniMarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int quantityOfSnowInHiltHouse = 29;
		int quantityOfSnowInElementarySchool = 17;
		int snowGapBetweenHiltAndBrecknock = quantityOfSnowInHiltHouse -quantityOfSnowInElementarySchool;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int totalAmountHoldingByHilt = 10;
		int amountSpendOnToy = 3;
		int amountSpendOnPencil = 2;
		int moneyLeft = totalAmountHoldingByHilt - (amountSpendOnToy + amountSpendOnPencil);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int initialNumberOfMarbles = 16;
		int numberOfMarblesLost =7;
		int numberOfMarblesAvailable = initialNumberOfMarbles -numberOfMarblesLost;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int initialNumberOfSeashells = 19;
		int numberOfSeashellsWanted = 25;
		int numberOfSeashellsNeedToBeFind = numberOfSeashellsWanted - initialNumberOfSeashells;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int numberOfRedBalloons = 8;
		int totalNumberOfBalloons = 17;
		int numberOfGreenBalloons = totalNumberOfBalloons - numberOfRedBalloons;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int initialNumberOfBooks = 38;
		int numberOfBooksAdd = 10;
		int totalBooks = initialNumberOfBooks + numberOfBooksAdd;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfLegsPerBee = 6;
		int numberOfBee = 8;
		int totalLegOfAllBees = numberOfBee * numberOfLegsPerBee;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int unitPrice = 99;
		int numberOfIceCream = 2;
		int totalCost = unitPrice * numberOfIceCream;



        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int numberOfRocks = 125;
		int initialNumberOfRocks = 64;
		int numberOfRocksNeeded = numberOfRocks - initialNumberOfRocks;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int numberOfMarblesOwnByHilt =38;
		int quantityOfMarblesLost = 15;
		int quantityOfMarblesLeft = numberOfMarblesOwnByHilt - quantityOfMarblesLost;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int firstDistanceDrove=32;
		int totalDistance =78;
		int distanceLeftToDrive = totalDistance - firstDistanceDrove;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int hoursInMorning = 90;
		int hoursInAfternoon = 30;
		int totalHours = hoursInAfternoon + hoursInMorning;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int piecePrice = 50;
		int pieceNumber =6;
		int totalPrice = 50 *6;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int amountInDisposal = 50;
		int pencilPrice = 7;
		int numberOfPencils = amountInDisposal/pencilPrice;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numberOfButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = numberOfButterflies -orangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int amountGave = 1* 100;
		int candyCost = 54;
		int changeReceive = amountGave - candyCost;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int initialTrees = 13;
		int treesPlant = 12;
		int totalTrees = initialTrees + treesPlant;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int numberOfDays = 2;
		int hoursLeft = numberOfDays * 24;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int numberOfGumPerCousin = 5;
		int gumNeeded = numberOfCousins * numberOfGumPerCousin;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int danCashFlow = 3;
		int costOfCandy = 1;
		int danMoneyRemind = danCashFlow - costOfCandy;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int numberOfBoats = 5;
		int numberOfPeoplePerBoat = 3;
		int totalNumberOfPeople = numberOfBoats * numberOfPeoplePerBoat;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int initialNumberOfLegos = 380;
		int totalLegosLost = 57;
		int numberOfLegosLeft = initialNumberOfLegos - totalLegosLost;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBaked = 35;
		int totalMuffinsNeeded = 83;
		int neededMuffins = totalMuffinsNeeded - muffinsBaked;



        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayonsQuantity = 1400;
		int lucyCrayonsQuantity = 290;
		int gapNumberOfCrayons = willyCrayonsQuantity - lucyCrayonsQuantity;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numberOfStickersPerPage = 10;
		int numberOfPage = 22;
		int totalStickers = numberOfStickersPerPage * numberOfPage;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfCupcakes = 100;
		int numberOfChildren = 8;
		int numberOfCupcakesPerChild = numberOfCupcakes / numberOfChildren;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int numberOfCookies = 47;
		int cookiesPerJar = 6;
		int cookiesLeftOver = numberOfCookies % cookiesPerJar;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int numberOfCroissant = 59;
		int numberOfPeople = 8;
		int croissantLeftWithMariam = numberOfCroissant % numberOfPeople;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int numberOfOatmealCookies = 276;
		int numberOfCookiesPerTray = 12;
		int numberOfTrayNeeded = numberOfOatmealCookies % numberOfCookiesPerTray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int quantityOfPretzels = 480;
		int numberOfPretzelsPerServings = 12;
		int numberOfServings = quantityOfPretzels % numberOfPretzelsPerServings;



        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int numberOfLemons = 53;
		int numberOfLemonsLeftHome =2;
		int numberOfLemonsPerBox = 3;
		int numberOfBoxesGave = (numberOfLemons -numberOfLemonsLeftHome) / numberOfLemonsPerBox;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int numberOfCarrotsSticks = 74;
		int numberOfPeopleServed = 12;
		int numberOfCarrotsLeftUneaten = numberOfCarrotsSticks % numberOfPeopleServed;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int numberOfTeddy = 98;
		int numberOfTeddyPerShelve = 7;
		int totalShelvesFilled = numberOfTeddy / numberOfTeddyPerShelve;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int quantityOfPicture = 480;
		int picturePerAlbum = 20;
		int numberOfAlbumNeeded = quantityOfPicture / picturePerAlbum;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int numberOfCards = 94;
		int maxCardsPerBox  = 8;
		int numberOfBoxFilled = numberOfCards / maxCardsPerBox;
		int numberOfCardsUnfilled = numberOfCards % maxCardsPerBox;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksQuantity = 210;
		int shelvesQuantity = 10;
		int numberOfBooksPerShelves = booksQuantity / shelvesQuantity;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int quantityOfCroissantBaked = 17;
		int numberOfGuess =7;
		int croissantPerGuess = quantityOfCroissantBaked /numberOfGuess;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billHourPerRoom = 2.15;
		double jillHourPerRoom = 1.9;
		int numberOfRoom = 5;
		double HoursNeedForBoth =((billHourPerRoom + jillHourPerRoom) /2) * 5;


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String lastName = "Hopper";
		String firstName =" Grace";
		char middleNameInitial ='B';
		String fullName = lastName +", "+ firstName + "" + middleNameInitial;


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		int distanceNewYorkToChicago = 800;
		int distanceTravelled = 537;
		int percentageCompleted = (distanceTravelled / distanceNewYorkToChicago) * 100;

	}

}
