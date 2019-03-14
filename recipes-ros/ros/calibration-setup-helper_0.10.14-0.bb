DESCRIPTION = "This package contains a script to generate calibration launch and configurationfiles for your robot. which is based on Michael Ferguson's calibration code"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "calibration-launch"

RDEPENDS_${PN} = "calibration-launch"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration_setup_helper/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "954b8232bf4743b7748a3f5b490862c0"
SRC_URI[sha256sum] = "860ae9436ebb32f82961749186b07d6d8c5f2885897baf629226b5e0db51b588"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-calibration_setup_helper-0.10.14-0"

inherit catkin
