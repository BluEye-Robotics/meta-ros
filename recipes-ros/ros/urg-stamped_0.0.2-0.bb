DESCRIPTION = "Precisely stamped URG driver for ROS"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/seqsense/urg_stamped-release/archive/release/melodic/urg_stamped/0.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "97bf4d02c8846cc8c33c05fb5f46a54d"
SRC_URI[sha256sum] = "61fcca882388f29606ea22d0017c5e19cec9c4edb2b970816693598b38609678"

S = "${WORKDIR}/urg_stamped-release-release-melodic-urg_stamped-0.0.2-0"

inherit catkin
