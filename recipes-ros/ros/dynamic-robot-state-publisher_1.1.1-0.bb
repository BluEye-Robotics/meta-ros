DESCRIPTION = "Improved ROS robot_state_publisher which can update the robot model via dynamic_reconfigure."
AUTHOR = "Martin Pecka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure kdl-parser robot-state-publisher roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/peci1/dynamic_robot_state_publisher-release/archive/release/melodic/dynamic_robot_state_publisher/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4f70bbd7524d117a242e1102be940bdb"
SRC_URI[sha256sum] = "d31428da9f939d33337bd61e9cefca16a4d820d208c3d75637999dc912d6629e"

S = "${WORKDIR}/dynamic_robot_state_publisher-release-release-melodic-dynamic_robot_state_publisher-1.1.1-0"

inherit catkin
