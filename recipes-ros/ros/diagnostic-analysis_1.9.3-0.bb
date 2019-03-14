DESCRIPTION = "The diagnostic_analysis package can convert a log of diagnostics data into a series of CSV files. Robot logs are recorded with rosbag, and can be processed offline using the scripts in this package."
AUTHOR = "Kevin Watts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs rosbag roslib rostest diagnostic-msgs rosbag roslib"

RDEPENDS_${PN} = "diagnostic-msgs rosbag roslib"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/diagnostic_analysis/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8dd5c6b28bea79299437432e7cfea70c"
SRC_URI[sha256sum] = "72eb7b968b92d97d5c95a15a4e9e573c9f025158e2a4e4375ad18b744858093f"

ROS_SPN = "diagnostics"
S = "${WORKDIR}/diagnostics-release-release-melodic-diagnostic_analysis-1.9.3-0"

inherit catkin
