package hrms.northwind.core.adapters;

import org.springframework.web.multipart.MultipartFile;

import hrms.northwind.core.utilities.results.DataResult;

import java.io.IOException;
import java.util.Map;

public interface CloudService {
    DataResult<Map<String, String>> upload(MultipartFile file);
    DataResult<Map> delete(String id) throws IOException;
}