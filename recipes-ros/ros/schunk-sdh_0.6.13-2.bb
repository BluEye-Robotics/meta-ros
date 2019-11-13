DESCRIPTION = "This package provides an interface for operating the schunk dexterous hand (SDH), including the tactile sensors."
AUTHOR = "Mathias Luedtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation roslint actionlib boost cob-srvs control-msgs diagnostic-msgs dpkg libntcan libpcan libusb-dev roscpp sensor-msgs std-msgs std-srvs trajectory-msgs urdf sdhlibrary-cpp"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_sdh/0.6.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2e655cc203a835478179c6f02b256a2c"
SRC_URI[sha256sum] = "f6010706d4c01738c29727fda87e6ec606db39057bdffd58473af3d4629bb3e5"

ROS_SPN = "schunk_modular_robotics"
S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_sdh-0.6.13-2"

inherit catkin
