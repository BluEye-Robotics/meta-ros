DESCRIPTION = "cob_relayboard"
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-msgs roscpp std-msgs"

RDEPENDS_${PN} = "rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_relayboard/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94efdfdc6b13e5d3b8038228ac3dbe7b"
SRC_URI[sha256sum] = "2912711b9f29411d00dfb918fe30841f958fe23b154d05725d67330784389e1f"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_relayboard-0.7.1-1"

inherit catkin
