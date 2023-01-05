package logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    private FlowerRepo flowerRepo;

    @Autowired
    public FlowerService(FlowerRepo flowerRepository) {
        this.flowerRepo = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepo.findAll();
    }

    public void addFlower(Flower flower){
        flowerRepo.save(flower);
    }
}
