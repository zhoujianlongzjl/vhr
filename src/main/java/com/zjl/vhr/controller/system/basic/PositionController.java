package com.zjl.vhr.controller.system.basic;

import com.zjl.vhr.entity.Position;
import com.zjl.vhr.entity.RespBean;
import com.zjl.vhr.service.PositionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {

    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public List<Position> getAllPosition(){
        List<Position> positions = positionService.list();
        return positions;
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        position.setEnabled(true);
        if (positionService.save(position)){
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @PutMapping("/")
    public RespBean updatePositions(@RequestBody Position position){
        if (positionService.updateById(position)){
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deletePositionById(@PathVariable Integer id){
        if (positionService.removeById(id)){
            return RespBean.ok("删除成功！");
        }
        return RespBean.ok("删除失败！");
    }

    @DeleteMapping("/")
    public RespBean deletePositionByIds(Integer[] ids){
        if (positionService.removeByIds(Arrays.asList(ids))){
            return RespBean.ok("删除成功！");
        }
        return RespBean.ok("删除失败！");
    }
}
