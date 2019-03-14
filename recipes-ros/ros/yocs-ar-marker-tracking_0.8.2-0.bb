DESCRIPTION = "Collecting, tracking and generating statistics for ar markers from ar_track_alvar."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ar-track-alvar-msgs roscpp geometry-msgs sensor-msgs yaml-cpp yocs-math-toolkit ar-track-alvar-msgs roscpp geometry-msgs sensor-msgs yaml-cpp yocs-math-toolkit"

RDEPENDS_${PN} = "ar-track-alvar-msgs roscpp geometry-msgs sensor-msgs yaml-cpp yocs-math-toolkit"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_ar_marker_tracking/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa6cdeeaf2b2e460c8b3eb3a1e1ec637"
SRC_URI[sha256sum] = "10cb24072d6c3a4eb12bd24686276fe3ee8b70ec4cef5c4e38257fdd5bdf0ac7"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_ar_marker_tracking-0.8.2-0"

inherit catkin
