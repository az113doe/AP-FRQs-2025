public int walkDogs(int hour) {
  int dogAv = company.numAvailableDogs(hour);
  int dogsToWalk = Math.min(dogAv, maxDogs);
  company.updateDogs(hour, dogsToWalk);
  return dogsToWalk;
}
