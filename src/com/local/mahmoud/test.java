//int loc = 1;
//        while(true) {
//        System.out.println(locations.get(loc).getDescription());
//        if (loc == 0) {
//        break;
//        }
//        Map<String, Integer> exists = locations.get(loc).getExist();
//        System.out.print("Available paths are : ");
//        for (String key : exists.keySet()) {
//        System.out.print(key + ",");
//        }
//        System.out.println();
//
//        String latterDirection = scanner.nextLine().toUpperCase();
//        if (exists.containsKey(latterDirection)) {
//        loc = exists.get(latterDirection);
//
//        }else{
//        System.out.println("you cannot go to that path!");
//        }
//        }
//
//        }