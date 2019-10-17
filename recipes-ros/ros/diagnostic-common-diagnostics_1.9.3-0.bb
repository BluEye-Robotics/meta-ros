DESCRIPTION = "diagnostic_common_diagnostics"
AUTHOR = "Brice Rebsamen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy diagnostic-updater rostest diagnostic-updater hddtemp rospy tf python3-psutil"

RDEPENDS_${PN} = "diagnostic-updater hddtemp rospy tf python3-psutil"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/diagnostic_common_diagnostics/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e501446840309caf287f976a99329854"
SRC_URI[sha256sum] = "e9729593c5e73825e769d670d78ba809db061ffb344132201020eae878c1359c"

ROS_SPN = "diagnostics"
S = "${WORKDIR}/diagnostics-release-release-melodic-diagnostic_common_diagnostics-1.9.3-0"

inherit catkin
