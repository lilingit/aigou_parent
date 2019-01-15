package com.mrsll.aigou.service.impl;

import com.mrsll.aigou.domain.Product;
import com.mrsll.aigou.mapper.ProductMapper;
import com.mrsll.aigou.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author LiSir
 * @since 2019-01-15
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
