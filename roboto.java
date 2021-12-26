public static void moveRobot(Robot robot, int toX, int toY) {
        int stepX = Math.abs(toX - robot.getX());
        int stepY = Math.abs(toY - robot.getY());

        if(toX >= 0){
            if (robot.getX() <= toX){
                if (robot.getDirection() != Direction.RIGHT){
                    switch(robot.getDirection()){
                        case LEFT:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case UP:
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            break;
                    }
                }
            }else{
                if (robot.getDirection() != Direction.LEFT){
                    switch(robot.getDirection()){
                        case RIGHT:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.turnRight();
                            break;
                    }
                }
            }
        }else{
            if (robot.getX() >= toX){
                if (robot.getDirection() != Direction.LEFT){
                    switch(robot.getDirection()){
                        case RIGHT:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.turnRight();
                            break;
                    }
                }
            }else {
                if (robot.getDirection() != Direction.RIGHT) {
                    switch (robot.getDirection()) {
                        case LEFT:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case UP:
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            break;
                    }
                }
            }
        }

        for (int step=0; step < stepX; step++){
            robot.stepForward();
        }

        if(toY >= 0) {
            if (robot.getY() <= toY) {
                if (robot.getDirection() != Direction.UP) {
                    switch (robot.getDirection()){
                        case DOWN:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case LEFT:
                            robot.turnRight();
                            break;
                        case RIGHT:
                            robot.turnLeft();
                            break;
                    }
                }
            } else {
                if (robot.getDirection() != Direction.DOWN) {
                    switch (robot.getDirection()){
                        case UP:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                        case LEFT:
                            robot.turnLeft();
                            break;
                    }
                }
            }
        }else{
            if (robot.getY() >= toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    switch (robot.getDirection()){
                        case UP:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                        case LEFT:
                            robot.turnLeft();
                            break;
                    }
                }
            }else{
                if (robot.getDirection() != Direction.UP) {
                    switch (robot.getDirection()){
                        case DOWN:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case LEFT:
                            robot.turnRight();
                            break;
                        case RIGHT:
                            robot.turnLeft();
                            break;
                    }
                }
            }
        }

        for (int step = 0; step < stepY; step++) {
            robot.stepForward();
        }
    }
