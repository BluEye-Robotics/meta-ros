SRC_URI = "https://github.com/ros-industrial/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "12f9f5ce82d1bb678752011786c7828a"
SRC_URI[sha256sum] = "b822d2a70eb273076d7dfde847bd52593d6577503207beb98a43b96855f64250"

S = "${WORKDIR}/${ROS_SPN}-${PV}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_canopen"
