DESCRIPTION = "		This package wraps the external c++ library opengm in a ROS package, so other packages can use it. It downloads the source code of it and then unzips it. The library is a header-only library with command line interfaces, which aren't used, so it doesn't gets build. For further descriptions and tutorials see the Makefile. tarball and https://github. com/opengm/opengm . 		Copyright (C) 2013 Bjoern Andres, Thorsten Beier and Joerg H. ~Kappes."
AUTHOR = "Florian Jordan"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1a58895467feb5b42724abbf3f0d9612"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/melodic/opengm/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0204bfd666d50db670ee67584531bc95"
SRC_URI[sha256sum] = "9fb81f609d688597d62a6c37ee622271598c08d258b3c4cc97fbcf7fb83f6242"

ROS_SPN = "cob_extern"
S = "${WORKDIR}/cob_extern-release-release-melodic-opengm-0.6.14-1"

inherit catkin
