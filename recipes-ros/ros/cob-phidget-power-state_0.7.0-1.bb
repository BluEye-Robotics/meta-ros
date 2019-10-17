DESCRIPTION = "The cob_phidget_power_state package"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs cob-phidgets rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_phidget_power_state/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "da94f3d0f5bc76d92802b641e510f59f"
SRC_URI[sha256sum] = "d79776bbc3ce0129a4a53b9db3a8035ebc4bdd374107b5bf70e5ae843d6417f6"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_phidget_power_state-0.7.0-1"

inherit catkin
