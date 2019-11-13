DESCRIPTION = "This package provides a node broadcasting a tf frame based on reflector markers detected within sensor_msgs::LaserScan messages. It can be used to position/reference a robot wrt to the reflektor markers."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_substitute-release/archive/release/melodic/cob_reflector_referencing/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fcd46cea8daaa3fea4dc3778c7efb4fc"
SRC_URI[sha256sum] = "f6fd5812a4814bf65b6281e10f2c1af67c42c1404dede7bdec68a9f7a62924ba"

ROS_SPN = "cob_substitute"
S = "${WORKDIR}/cob_substitute-release-release-melodic-cob_reflector_referencing-0.6.8-1"

inherit catkin
