DESCRIPTION = "The 'cob_base_velocity_smoother' reads velocity messages and publishes messages of the same type for "smoothed" velocity to avoid shaking behavior."
AUTHOR = "Florian Mirus"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost dynamic-reconfigure geometry-msgs nav-msgs roscpp roslint std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_base_velocity_smoother/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b8816186c79d898f3d8b1340138f546c"
SRC_URI[sha256sum] = "4feaadef5cd6375527ff72d0b69cdb721c6fd66185f0d518bac51c03f3735639"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_base_velocity_smoother-0.8.1-1"

inherit catkin
