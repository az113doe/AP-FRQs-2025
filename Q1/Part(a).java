public int walkDogs(int hour) {
  int num = company.numAvaliableDogs(hour);
  if (maxDogs >= num) {
      company.updateDogs(hour, num);
      return num;
  }else {
      company.updateDogs(hour, maxDogs):
      return maxDogs;
  }
}
