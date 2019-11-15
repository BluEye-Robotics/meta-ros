DESCRIPTION = "The cob_phidget_power_state package"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs cob-phidgets rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_phidget_power_state/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "711ecad59462bca539c577ff0d08a14d"
SRC_URI[sha256sum] = "99b555237b13dbb1a61c2f550491f02a577bdf10892bb1e889eb3c859220e004"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_phidget_power_state-0.7.1-1"

inherit catkin
