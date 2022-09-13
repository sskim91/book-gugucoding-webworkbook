package org.zerock.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by sskim
 */
@Repository
@Qualifier("normal")
public class SampleDAOImpl implements SampleDAO{
}
