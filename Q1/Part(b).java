public int dogWalkShift(int startHour, int endHour) {
  int earn = 0;
  for (int i = startHour; i <= endHour; i++) {
    int walkedDogs = walkDogs(hour);
    int earning = walkedDogs * 5;
    
    if ((walkedDogs == maxDogs) || (hour >= 9 && hour <= 17)) {
      earn += 3;
    }

    earn += earning;
  }
  return earn;
}
