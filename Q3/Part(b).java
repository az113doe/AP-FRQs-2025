public ArrayList<Match> buildMatches() {
    ArrayList<Match> matches = new ArrayList<Match>();
    int left = 0;
    int right = competitorList.size();

    while (left < right) {
        Competitor highRank = competitorList.get(left);
        Competitor lowRank = competitorList.get(right);
        Match m = new Match(highRank, lowRank);
        matches.add(m);
        left++;
        right--;
    }
    return matches;
}
