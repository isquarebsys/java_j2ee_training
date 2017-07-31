<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<xsl:apply-templates></xsl:apply-templates>
	</xsl:template>
	<xsl:template match="employee">
		<xsl:value-of select="."/>
	</xsl:template>
</xsl:stylesheet>