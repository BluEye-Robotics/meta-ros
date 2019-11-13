DESCRIPTION = "Leg Detector using a machine learning approach to find leg-like patterns of laser scanner readings."
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bfl dynamic-reconfigure geometry-msgs image-geometry laser-geometry message-filters people-msgs people-tracking-filter roscpp sensor-msgs std-msgs std-srvs tf visualization-msgs"

RDEPENDS_${PN} = "laser-filters map-laser"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/leg_detector/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dcb0efcc3ee8da42f82e49073991606c"
SRC_URI[sha256sum] = "aaf47802eea191142252e69d7044c0b308fd70350c8fd2650e7c682069e2e9de"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-leg_detector-1.2.0-1"

inherit catkin
