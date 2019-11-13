DESCRIPTION = "Precisely stamped URG driver for ROS"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/seqsense/urg_stamped-release/archive/release/melodic/urg_stamped/0.0.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aa0ae43a5c0f11df9c1ccd991ee1a619"
SRC_URI[sha256sum] = "39b46f6c170dee6ab94eca3fec1a364123d3efb290c5790219ca820ddccff739"

S = "${WORKDIR}/urg_stamped-release-release-melodic-urg_stamped-0.0.3-1"

inherit catkin
