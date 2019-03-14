DESCRIPTION = "control_msgs contains base messages and actions useful for controlling robots. It provides representations for controller setpoints and joint and cartesian trajectories."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs trajectory-msgs geometry-msgs actionlib-msgs message-runtime std-msgs trajectory-msgs geometry-msgs actionlib-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs trajectory-msgs geometry-msgs actionlib-msgs"

SRC_URI = "https://github.com/ros-gbp/control_msgs-release/archive/release/melodic/control_msgs/1.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f16586b740842f0eb148c6bfde32d3f6"
SRC_URI[sha256sum] = "12c341b7f245c27bed738494241445879e58aefa0368ba688c67fb114f852d58"

S = "${WORKDIR}/control_msgs-release-release-melodic-control_msgs-1.5.0-0"

inherit catkin
