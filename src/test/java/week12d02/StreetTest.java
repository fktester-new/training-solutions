package week12d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {

    @Test
    public void testSellSite(){

        Street street = new Street();
        Site site1 = new Site(0, 10, Fence.PERFECT);
        Site site2 = new Site(0, 7, Fence.NEED_UPGRADE);
        Site site3 = new Site(1, 12, Fence.NEED_UPGRADE);
        Site site4 = new Site(0, 9, Fence.PERFECT);
        Site site5 = new Site(0, 11, Fence.NO_FENCE);
        Site site6 = new Site(1, 13, Fence.PERFECT);
        Site site7 = new Site(1, 15, Fence.NO_FENCE);

        street.sellSite(site1);
        street.sellSite(site2);
        street.sellSite(site3);
        street.sellSite(site4);
        street.sellSite(site5);
        street.sellSite(site6);
        street.sellSite(site7);

        assertEquals(7, street.getSites().size());
        assertEquals(15, street.getSites().get(6).getLength() );
    }

    @Test
    public void testGetHouseNumber(){

        Street street = new Street();
        Site site1 = new Site(0, 10, Fence.PERFECT);
        Site site2 = new Site(0, 7, Fence.NEED_UPGRADE);
        Site site3 = new Site(1, 12, Fence.NEED_UPGRADE);
        Site site4 = new Site(0, 9, Fence.PERFECT);
        Site site5 = new Site(0, 11, Fence.NO_FENCE);
        Site site6 = new Site(1, 13, Fence.PERFECT);
        Site site7 = new Site(1, 15, Fence.NO_FENCE);

        street.sellSite(site1);
        street.sellSite(site2);
        street.sellSite(site3);
        street.sellSite(site4);
        street.sellSite(site5);
        street.sellSite(site6);
        street.sellSite(site7);

        assertEquals(5, street.getHouseNumber());
       assertEquals(12, street.getSites().get(2).getLength());
    }

    @Test
    void testFenceStats(){
        Street street = new Street();
        Site site1 = new Site(0, 10, Fence.PERFECT);
        Site site2 = new Site(0, 7, Fence.NEED_UPGRADE);
        Site site3 = new Site(1, 12, Fence.NEED_UPGRADE);
        Site site4 = new Site(0, 9, Fence.PERFECT);
        Site site5 = new Site(0, 11, Fence.NO_FENCE);
        Site site6 = new Site(1, 13, Fence.PERFECT);
        Site site7 = new Site(1, 15, Fence.NO_FENCE);

        street.sellSite(site1);
        street.sellSite(site2);
        street.sellSite(site3);
        street.sellSite(site4);
        street.sellSite(site5);
        street.sellSite(site6);
        street.sellSite(site7);

        List<Report> result = street.fenceStats();
        assertEquals(2, result.get(1).getAmount());
    }

}