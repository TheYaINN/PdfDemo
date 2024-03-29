package de.joachimsohn.pdf.domain.creator.impl;

import de.joachimsohn.pdf.domain.creator.BasePdfCreator;
import de.joachimsohn.pdf.domain.model.PdfContextData;
import de.joachimsohn.pdf.domain.model.PdfData.PdfType;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;

@Component
public final class PdfBCreator extends BasePdfCreator {

    @Override public boolean applies(final @NotNull PdfType type) {
        return PdfType.TYPE_B.equals(type);
    }

    @Override protected @NotNull String getTemplate(final @NotNull PdfType type) {
        return "thymeleaf_template";
    }

    @Override protected @NotNull Context getContext(final @NotNull PdfContextData contextData) {
        Context context = new Context();
        context.setVariable("title", "BBBBBBBB");
        return context;
    }
}
