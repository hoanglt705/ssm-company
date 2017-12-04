package porters.extract.service;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

/**
 * Making a feature off the custom json provider
 * http://stackoverflow.com/questions/18872931/custom-objectmapper-with-jersey-2-2-and-jackson-2-1
 *
 */
public class MarshallingFeature implements Feature
{
    /* (non-Javadoc)
     * @see javax.ws.rs.core.Feature#configure(javax.ws.rs.core.FeatureContext)
     */
    @Override
    public boolean configure(FeatureContext context)
    {
        context.register(CustomJsonProvider.class, MessageBodyReader.class, MessageBodyWriter.class);
        return true;
    }
}
