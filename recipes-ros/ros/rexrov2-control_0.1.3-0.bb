DESCRIPTION = "The rexrov2_control package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros gazebo-ros-control uuv-control-cascaded-pid uuv-thruster-manager uuv-trajectory-control"

SRC_URI = "https://github.com/uuvsimulator/rexrov2-release/archive/release/melodic/rexrov2_control/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "69e59bcc13f08638f59280af5484bd63"
SRC_URI[sha256sum] = "9a67201f385a31d026e498160846d97db310a798104f41aa97173e6827211ae6"

ROS_SPN = "rexrov2"
S = "${WORKDIR}/rexrov2-release-release-melodic-rexrov2_control-0.1.3-0"

inherit catkin
