DESCRIPTION = "A library that provides convenient methods for manipulating ROS images with ImageZero"
AUTHOR = "P. J. Reed"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp cv-bridge imagezero message-runtime sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/melodic/imagezero_ros/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "64de98560dc388460756dca2d7e1bb5d"
SRC_URI[sha256sum] = "3bebcdd5695eedb7733be8f49515ff4c8d341fe5f75f09442ddb2e5ca44a1766"

ROS_SPN = "imagezero_transport"
S = "${WORKDIR}/imagezero_transport-release-release-melodic-imagezero_ros-0.2.4-0"

inherit catkin
