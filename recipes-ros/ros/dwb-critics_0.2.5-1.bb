DESCRIPTION = "Implementations for dwb_local_planner TrajectoryCritic interface"
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles costmap-queue dwb-local-planner geometry-msgs nav-2d-msgs nav-2d-utils nav-core2 nav-grid-iterators pluginlib roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/dwb_critics/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f18b699d67d5804f1454b5613da345f"
SRC_URI[sha256sum] = "42ff253d658b161baff427aa5da4a789f5dcf17d61e316cc8f40bd320ce00a3f"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-dwb_critics-0.2.5-1"

inherit catkin
