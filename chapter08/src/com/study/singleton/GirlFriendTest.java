package com.study.singleton;

/**
 * ClassName: GirlFriend
 * Package: com.study.singleton
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/22 13:53
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend ins1 = GirlFriend.getInstance();
        GirlFriend ins2 = GirlFriend.getInstance();
        System.out.println(ins1 == ins2);
    }
}
//延迟加载，因为用的时候加载
class GirlFriend {
    private static GirlFriend instance = null;

    private GirlFriend() {
    }

    public static GirlFriend getInstance() {
        if (instance == null) {
            instance = new GirlFriend();
        }
        return instance;
    }
}
