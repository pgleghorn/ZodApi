package io.swagger.api;

import io.swagger.model.ZodObject;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T12:11:28.570Z")

@Api(value = "zod", description = "the zod API")
public interface ZodApi {

    @ApiOperation(value = "search Zod objects", notes = "Use parameters to search for Zod objects. Without any parameters, return all Zod objects.", response = ZodObject.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = ZodObject.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = ZodObject.class) })
    @RequestMapping(value = "/zod",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ZodObject>> searchZodObjects(@ApiParam(value = "pass an optional search string for looking up zod objects") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);

}
