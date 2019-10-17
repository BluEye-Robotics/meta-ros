DESCRIPTION = "The laser_scan_publisher_tutorial package"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs roscpp sensor-msgs"

RDEPENDS_${PN} = "roscpp sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/laser_scan_publisher_tutorial/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "724f3d519b2a53f856217924579f487f"
SRC_URI[sha256sum] = "a2ae17a2a286701f18239ceb8e8ce3723a45bf349ecfd3df1f4d085f25174fbd"

ROS_SPN = "navigation_tutorials"
S = "${WORKDIR}/navigation_tutorials-release-release-melodic-laser_scan_publisher_tutorial-0.2.3-1"

inherit catkin
