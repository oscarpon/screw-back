package com.opbaquero.screw.domain.entity;

import com.opbaquero.screw.domain.exception.InvalidEanException;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.regex.Pattern;

@RequiredArgsConstructor
public class EAN {

    @Getter
    @NonNull
    private String code;

    /**
     * Check if EAN code is valid. 13 digits.
     * @return TRUE if is valid FALSE if not
     */
    public boolean isValid(){
        Pattern pattern = Pattern.compile("[0-9]{12}[012345689]{1}");
        return pattern.matcher(this.code).matches();
    }

    /**
     * Get the digits from code from position 0 to 7.
     * @return the supplier id
     */
    public Integer getSupplierId(){
        if(this.isValid()){
            return Integer.valueOf(this.code.substring(0,7));
        }else{
            throw new InvalidEanException(this.code);
        }

    }

    /**
     * Get the digits from product id from positions 7 to 12.
     * @return the product code
     */
    public Integer getProductId(){
        if(this.isValid()){
            return Integer.valueOf(this.code.substring(7,12));
        }else{
            throw new InvalidEanException(this.code);
        }

    }

    /**
     * Get the location id digit. Last digit in code
     * @return the location id
     */
    public Integer getLocationId(){
        if(this.isValid()){
            return Integer.valueOf(this.code.substring(12,13));
        }else{
            throw new InvalidEanException(this.code);
        }

    }


}
