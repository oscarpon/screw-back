package com.opbaquero.screw.domain.usecase;

import com.opbaquero.screw.domain.entity.EAN;
import com.opbaquero.screw.domain.entity.Product;

public interface ScrewUseCase {

    Product getProductByEan(EAN ean);

}
