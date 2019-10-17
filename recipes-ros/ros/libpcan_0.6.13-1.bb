DESCRIPTION = "This package wraps the libpcan to use it as a ros dependency"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "linux-headers-generic"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/melodic/libpcan/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9a6e2f863045f4884745ebc4b5e91f00"
SRC_URI[sha256sum] = "071c830e338eb31913624b8c9cdbe911fac0db917651acdfc705b30c507df8ab"

ROS_SPN = "cob_extern"
S = "${WORKDIR}/cob_extern-release-release-melodic-libpcan-0.6.13-1"

inherit catkin
