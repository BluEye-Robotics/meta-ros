DESCRIPTION = "The 'cob_base_velocity_smoother' reads velocity messages and publishes messages of the same type for "smoothed" velocity to avoid shaking behavior."
AUTHOR = "Florian Mirus"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost dynamic-reconfigure geometry-msgs nav-msgs roscpp roslint std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_base_velocity_smoother/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7a16f8da32e75e0635f23de635596d3"
SRC_URI[sha256sum] = "b61978c3085f865678cf238a44dfec284ab04c74266ee71019ca309fd2d65448"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_base_velocity_smoother-0.8.0-1"

inherit catkin
