DESCRIPTION = "The odometry_publisher_tutorial package"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-msgs roscpp tf nav-msgs roscpp tf"

RDEPENDS_${PN} = "nav-msgs roscpp tf"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/odometry_publisher_tutorial/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1c6c56cf07c9d35505ef5e5c6c6316c1"
SRC_URI[sha256sum] = "2f5bd429f29f3d9c424db0f617558d73af9c851f1087f24742ebdda967f4e664"

ROS_SPN = "navigation_tutorials"
S = "${WORKDIR}/navigation_tutorials-release-release-melodic-odometry_publisher_tutorial-0.2.3-1"

inherit catkin
