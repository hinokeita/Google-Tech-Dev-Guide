def make_bricks(small, big, goal):
    if (goal % 5 ) <= small and (goal - (big * 5)) <= small:
        return True
    else:
        return False

print(make_bricks(3,1,8))
