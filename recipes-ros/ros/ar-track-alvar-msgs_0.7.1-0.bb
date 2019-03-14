DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs message-runtime geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime geometry-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/ar_track_alvar-release/archive/release/melodic/ar_track_alvar_msgs/0.7.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fdc2a1ad61419cb83d1e6e318bcdb3df"
SRC_URI[sha256sum] = "0c39c3c9732ca3712a78f43bcc2545f90b846aff2559de8a5fc7a9b4a6efb27f"

ROS_SPN = "ar_track_alvar"
S = "${WORKDIR}/ar_track_alvar-release-release-melodic-ar_track_alvar_msgs-0.7.1-0"

inherit catkin
