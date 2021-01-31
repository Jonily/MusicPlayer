package com.my.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Music {
    private int id;
    private String title;
    private String singer;
    private String time;
    private String url;



}
