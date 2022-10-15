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

    public boolean isValid(){
        Pattern pattern = Pattern.compile("[0-9]{12}[012345689]{1}");
        return pattern.matcher(this.code).matches();
    }

    public Integer getSupplierId(){
        if(this.isValid()){
            return Integer.valueOf(this.code.substring(0,7));
        }else{
            throw new InvalidEanException(this.code);
        }

    }

    public Integer getProductId(){
        if(this.isValid()){
            return Integer.valueOf(this.code.substring(7,12));
        }else{
            throw new InvalidEanException(this.code);
        }

    }

    public Integer getLocationId(){
        if(this.isValid()){
            return Integer.valueOf(this.code.substring(12,13));
        }else{
            throw new InvalidEanException(this.code);
        }

    }


}
