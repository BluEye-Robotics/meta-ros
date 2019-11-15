DESCRIPTION = "The assisted_teleop node subscribes to a desired trajectory topic (geometry_msgs/Twist) and uses TrajectoryPlannerROS to find a valid trajectory close to the desired trajectory before republishing. Useful for filtering teleop commands while avoiding obstacles. This package also contains LaserScanMaxRangeFilter, which is a LaserScan filter plugin that takes max range values in a scan and turns them into valid values that are slightly less than max range."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles base-local-planner costmap-2d libeigen filters geometry-msgs message-filters move-base-msgs pluginlib roscpp roslib sensor-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/assisted_teleop/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b043d1a7e864e0ecf853a081e40743b"
SRC_URI[sha256sum] = "56f3c08c49d88b8801f49b04f690b0d95ba6abe6dcbc0c4794674dd4cb5eb8e6"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-assisted_teleop-0.3.3-1"

inherit catkin
