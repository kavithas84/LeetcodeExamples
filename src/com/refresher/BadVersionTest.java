package com.refresher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadVersionTest {

    @Test
    void binarySearchTEst1(){
        BadVersion bd=new BadVersion();
        assertEquals(2,bd.firstBadVersion(2));
    }

}