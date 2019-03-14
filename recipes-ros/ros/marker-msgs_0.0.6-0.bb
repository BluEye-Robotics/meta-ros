DESCRIPTION = "The marker_msgs package contains messages usable to setup a marker/fiducial system. The package distinguishes between two types of messages. First messages to describe the properties of a marker/fiducial detection system and the detected markers. Secondly messages used to represent a map of markers/features with covariances as it would be produced by a SLAM system or published by a map server for self-localization."
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs geometry-msgs"

SRC_URI = "https://github.com/tuw-robotics/marker_msgs-release/archive/release/melodic/marker_msgs/0.0.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5c8017c975d7b17fd3ad8feb0f4ee47c"
SRC_URI[sha256sum] = "97c6b32ffed3602939b7decce5e38a880e7e64a3d1dd22217512ddf2779e48c5"

S = "${WORKDIR}/marker_msgs-release-release-melodic-marker_msgs-0.0.6-0"

inherit catkin
